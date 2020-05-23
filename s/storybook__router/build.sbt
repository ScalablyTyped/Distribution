organization := "org.scalablytyped"
name := "storybook__router"
version := "5.3.18-74050d"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-03f85a",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20200518Z-48aa64",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-4fb81d",
  "org.scalablytyped" %%% "reach__router" % "1.3-dt-20200426Z-89c27a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200515Z-0f8114",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
