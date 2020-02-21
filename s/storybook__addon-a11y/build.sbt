organization := "org.scalablytyped"
name := "storybook__addon-a11y"
version := "5.3.13-8442ab"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "axe-core" % "3.5.1-f9a353",
  "org.scalablytyped" %%% "csstype" % "2.6.6-ffacbb",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.27-407d45",
  "org.scalablytyped" %%% "emotion__core" % "10.0.20-ea664a",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.11-fdbdaf",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.17-88b07c",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.19-66f3fb",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.2-70bad0",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20200131Z-68f6ae",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-ee4622",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-05a52c",
  "org.scalablytyped" %%% "reach__router" % "1.3-dt-20200212Z-97754a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200122Z-b17eee",
  "org.scalablytyped" %%% "react-redux" % "7.1-dt-20200123Z-2bd320",
  "org.scalablytyped" %%% "redux" % "4.0.5-d8211d",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "storybook__api" % "5.3.13-291ec7",
  "org.scalablytyped" %%% "storybook__channels" % "5.3.13-58513c",
  "org.scalablytyped" %%% "storybook__theming" % "5.3.13-1b32b2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
