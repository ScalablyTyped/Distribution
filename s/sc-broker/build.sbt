organization := "org.scalablytyped"
name := "sc-broker"
version := "8.0-dt-20200205Z-0ff641"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-822e23",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-67a587",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20200205Z-5e40a0",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
