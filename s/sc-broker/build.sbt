organization := "org.scalablytyped"
name := "sc-broker"
version := "8.0-dt-20200519Z-5172bb"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-adf080",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-832ff5",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20200205Z-ad24a7",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
