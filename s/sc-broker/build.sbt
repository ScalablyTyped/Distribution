organization := "org.scalablytyped"
name := "sc-broker"
version := "8.0-dt-20200519Z-fe4f5a"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-b5e59b",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-61a4ae",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20200205Z-174750",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
