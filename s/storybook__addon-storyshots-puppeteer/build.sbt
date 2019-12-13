organization := "org.scalablytyped"
name := "storybook__addon-storyshots-puppeteer"
version := "5.1-dt-20191122Z-0c6cfa"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-a93afc",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.19-45e5b0",
  "org.scalablytyped" %%% "emotion__core" % "10.0.20-ac707c",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.11-f6e8da",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.17-0a18d8",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.19-d9e0a9",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.2-602d68",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20191126Z-4ceb2f",
  "org.scalablytyped" %%% "jest-image-snapshot" % "2.11-dt-20191025Z-77cb52",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191210Z-b5c359",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-5cddf8",
  "org.scalablytyped" %%% "puppeteer" % "2.0-dt-20191126Z-2effee",
  "org.scalablytyped" %%% "reach__router" % "1.2-dt-20191009Z-065584",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191209Z-f85fa6",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "storybook__addon-storyshots" % "5.1-dt-20191122Z-963dd1",
  "org.scalablytyped" %%% "storybook__addons" % "5.2.8-f6c92c",
  "org.scalablytyped" %%% "storybook__api" % "5.2.8-cfc4e1",
  "org.scalablytyped" %%% "storybook__channels" % "5.2.8-5bc41d",
  "org.scalablytyped" %%% "storybook__react" % "5.2.8-fce501",
  "org.scalablytyped" %%% "storybook__theming" % "5.2.8-7b690b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        