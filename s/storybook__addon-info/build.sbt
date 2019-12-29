organization := "org.scalablytyped"
name := "storybook__addon-info"
version := "5.2-dt-20191122Z-2beb9b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-32adec",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.27-715289",
  "org.scalablytyped" %%% "emotion__core" % "10.0.20-352bbb",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.11-eb6713",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.17-210c2f",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.19-3b9b10",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.2-7c9d88",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20191126Z-3767e6",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-bfe2c5",
  "org.scalablytyped" %%% "reach__router" % "1.2-dt-20191009Z-60a520",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-73a5bc",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "storybook__addons" % "5.2.8-490b05",
  "org.scalablytyped" %%% "storybook__api" % "5.2.8-e9d66b",
  "org.scalablytyped" %%% "storybook__channels" % "5.2.8-c7eb5d",
  "org.scalablytyped" %%% "storybook__theming" % "5.2.8-ed36ba")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        