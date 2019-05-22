organization := "org.scalablytyped"
name := "storybook__theming"
version := "5.0.11-94eb02"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-225f24",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.10-380561",
  "org.scalablytyped" %%% "emotion__core" % "10.0.10-36e652",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.6-f77f96",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.10-0415df",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.10-41c9c3",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.1-0e800f",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-ff94fb",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190520Z-43357b",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        