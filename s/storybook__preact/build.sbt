organization := "org.scalablytyped"
name := "storybook__preact"
version := "5.2.6-342678"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-3eaa6f",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.19-2c27d4",
  "org.scalablytyped" %%% "emotion__core" % "10.0.20-0119b7",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.11-02509b",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.17-e6dc56",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.19-8cc6ee",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.2-fb5db7",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190822Z-815dc4",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191115Z-3b62fb",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-8b44d5",
  "org.scalablytyped" %%% "reach__router" % "1.2-dt-20191009Z-000339",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191025Z-132fef",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "storybook__addons" % "5.2.6-bb0a2b",
  "org.scalablytyped" %%% "storybook__api" % "5.2.6-d7d5aa",
  "org.scalablytyped" %%% "storybook__channels" % "5.2.6-4cda16",
  "org.scalablytyped" %%% "storybook__router" % "5.2.6-acf5bc",
  "org.scalablytyped" %%% "storybook__theming" % "5.2.6-299386")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        