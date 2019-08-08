organization := "org.scalablytyped"
name := "storybook__api"
version := "5.1.10-32f4bc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-7e82e4",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.14-93c441",
  "org.scalablytyped" %%% "emotion__core" % "10.0.14-459a25",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.8-4d72f0",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.14-684d21",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.14-5da20c",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.2-3c2e35",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190322Z-796a7a",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f48590",
  "org.scalablytyped" %%% "reach__router" % "1.2-dt-20190404Z-84b155",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190807Z-04c1be",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "storybook__channels" % "4.1-dt-20190605Z-4781ea",
  "org.scalablytyped" %%% "storybook__router" % "5.1.10-8dc279",
  "org.scalablytyped" %%% "storybook__theming" % "5.1.10-c12c2f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        