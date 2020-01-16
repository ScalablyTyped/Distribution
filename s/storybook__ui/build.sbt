organization := "org.scalablytyped"
name := "storybook__ui"
version := "5.3.4-f0599a"
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
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20200114Z-accc59",
  "org.scalablytyped" %%% "popper_dot_js" % "1.16.0-8923e4",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-b24434",
  "org.scalablytyped" %%% "reach__router" % "1.2-dt-20191009Z-71736e",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-22d23f",
  "org.scalablytyped" %%% "react-textarea-autosize" % "4.3.0-dt-20191105Z-bc0a56",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "storybook__addon-actions" % "5.3.4-e5c469",
  "org.scalablytyped" %%% "storybook__api" % "5.3.5-6ce98f",
  "org.scalablytyped" %%% "storybook__channels" % "5.3.5-d469c9",
  "org.scalablytyped" %%% "storybook__components" % "5.3.5-aef838",
  "org.scalablytyped" %%% "storybook__theming" % "5.3.5-6079a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        