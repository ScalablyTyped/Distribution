organization := "org.scalablytyped"
name := "sc-broker"
version := "8.0-dt-20200519Z-7e1092"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-d8ed07",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-4658ca",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20200205Z-f2af9b",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
