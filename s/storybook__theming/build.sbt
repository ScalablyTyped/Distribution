organization := "org.scalablytyped"
name := "storybook__theming"
version := "5.3.7-af00ac"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-dcd929",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.27-5339c6",
  "org.scalablytyped" %%% "emotion__core" % "10.0.20-5dcb4b",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.11-265421",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.17-7280a3",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.19-a56594",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.2-c8c047",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-78233f",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-0e1ae9",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        