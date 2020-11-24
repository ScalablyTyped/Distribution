organization := "org.scalablytyped"
name := "react-md__autocomplete"
version := "2.4.3-f8d2c7"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.14-fa358f",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-0012d8",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-cfb347",
  "org.scalablytyped" %%% "react-md__button" % "2.4.2-85384a",
  "org.scalablytyped" %%% "react-md__form" % "2.4.3-f2ff62",
  "org.scalablytyped" %%% "react-md__list" % "2.4.3-b7ad39",
  "org.scalablytyped" %%% "react-md__portal" % "2.4.2-9b67df",
  "org.scalablytyped" %%% "react-md__states" % "2.4.2-fe8640",
  "org.scalablytyped" %%% "react-md__transition" % "2.4.2-8cd301",
  "org.scalablytyped" %%% "react-md__utils" % "2.4.2-f4d26e",
  "org.scalablytyped" %%% "react-transition-group" % "4.4-dt-20200521Z-c8851f",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
