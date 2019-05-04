organization := "org.scalablytyped"
name := "storybook__addons"
version := "4.1-dt-20190201Z-d46a8a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-225f24",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190503Z-6753fb",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-66be5f",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190504Z-19278e",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "storybook__channels" % "4.1-dt-20190201Z-c452a0",
  "org.scalablytyped" %%% "storybook__react" % "4.0-dt-20190213Z-653265")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        