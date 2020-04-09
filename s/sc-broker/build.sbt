organization := "org.scalablytyped"
name := "sc-broker"
version := "8.0-dt-20200205Z-6a2d8e"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-5ff1b8",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-b5ca0a",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20200205Z-894e2a",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
