organization := "org.scalablytyped"
name := "storybook__theming"
version := "5.3.5-6079a5"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-fd5644",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.27-b774a5",
  "org.scalablytyped" %%% "emotion__core" % "10.0.20-dc9b07",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.11-65d149",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.17-129fab",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.19-bd3404",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.2-9f63d9",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-b24434",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-22d23f",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        