organization := "org.scalablytyped"
name := "storybook__api"
version := "5.2.5-e3cdd4"
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
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-8b44d5",
  "org.scalablytyped" %%% "reach__router" % "1.2-dt-20191009Z-000339",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191025Z-132fef",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "storybook__channels" % "5.2.5-569fd4",
  "org.scalablytyped" %%% "storybook__router" % "5.2.5-421f9e",
  "org.scalablytyped" %%% "storybook__theming" % "5.2.5-e2086d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        