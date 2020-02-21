organization := "org.scalablytyped"
name := "storybook__ui"
version := "5.3.13-08b4b6"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-ffacbb",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.27-407d45",
  "org.scalablytyped" %%% "emotion__core" % "10.0.20-ea664a",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.11-fdbdaf",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.17-88b07c",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.19-66f3fb",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.2-70bad0",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20200131Z-68f6ae",
  "org.scalablytyped" %%% "popper_dot_js" % "1.16.1-07f87f",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-05a52c",
  "org.scalablytyped" %%% "reach__router" % "1.3-dt-20200212Z-97754a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200122Z-b17eee",
  "org.scalablytyped" %%% "react-syntax-highlighter" % "11.0-dt-20200102Z-6d49cf",
  "org.scalablytyped" %%% "react-textarea-autosize" % "4.3.0-dt-20191105Z-0ea429",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "storybook__addon-actions" % "5.3.13-008214",
  "org.scalablytyped" %%% "storybook__api" % "5.3.13-291ec7",
  "org.scalablytyped" %%% "storybook__channels" % "5.3.13-58513c",
  "org.scalablytyped" %%% "storybook__components" % "5.3.13-4eff79",
  "org.scalablytyped" %%% "storybook__theming" % "5.3.13-1b32b2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
