organization := "org.scalablytyped"
name := "react-md__list"
version := "2.1.2-cbb0ac"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "3.0.2-b6fa26",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-64dc32",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200711Z-7368c8",
  "org.scalablytyped" %%% "react-md__portal" % "2.0.2-382d5e",
  "org.scalablytyped" %%% "react-md__states" % "2.1.2-52ebe2",
  "org.scalablytyped" %%% "react-md__transition" % "2.1.2-be27f4",
  "org.scalablytyped" %%% "react-md__utils" % "2.1.0-e3df03",
  "org.scalablytyped" %%% "react-transition-group" % "4.4-dt-20200521Z-562c1f",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
