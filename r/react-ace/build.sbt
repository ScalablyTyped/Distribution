organization := "org.scalablytyped"
name := "react-ace"
version := "9.2.0-41f64d"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "ace-builds" % "1.4.12-6487f6",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b4f267",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-7dc507",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-9253ae",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
