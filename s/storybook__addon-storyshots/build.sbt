organization := "org.scalablytyped"
name := "storybook__addon-storyshots"
version := "5.1-dt-20191122Z-9da6db"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-a93afc",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.19-f32194",
  "org.scalablytyped" %%% "emotion__core" % "10.0.20-5c3421",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.11-f6e8da",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.17-fadf1d",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.19-749498",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.2-602d68",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20191126Z-410aca",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-08e889",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-5cddf8",
  "org.scalablytyped" %%% "reach__router" % "1.2-dt-20191009Z-a9dfcd",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191126Z-0aa2c4",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "storybook__addons" % "5.2.6-e6b501",
  "org.scalablytyped" %%% "storybook__api" % "5.2.6-ac36b4",
  "org.scalablytyped" %%% "storybook__channels" % "5.2.6-06fa66",
  "org.scalablytyped" %%% "storybook__react" % "5.2.6-805a2a",
  "org.scalablytyped" %%% "storybook__router" % "5.2.6-e190c4",
  "org.scalablytyped" %%% "storybook__theming" % "5.2.6-ec5b05")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        