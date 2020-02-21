organization := "org.scalablytyped"
name := "storybook__addon-storyshots"
version := "5.3.13-a45d4a"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__compiler" % "8.2.14-c5a41a",
  "org.scalablytyped" %%% "angular__core" % "8.2.14-534f48",
  "org.scalablytyped" %%% "csstype" % "2.6.6-ffacbb",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.27-407d45",
  "org.scalablytyped" %%% "emotion__core" % "10.0.20-ea664a",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.11-fdbdaf",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.17-88b07c",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.19-66f3fb",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.2-70bad0",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-9ad653",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-6f0a56",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20200131Z-68f6ae",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-16b5a8",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20200130Z-a55e30",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-623092",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-05a52c",
  "org.scalablytyped" %%% "reach__router" % "1.3-dt-20200212Z-97754a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200122Z-b17eee",
  "org.scalablytyped" %%% "rxjs" % "6.5.4-9b8c0f",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.4-f03c74",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "storybook__addons" % "5.3.13-1ec460",
  "org.scalablytyped" %%% "storybook__api" % "5.3.13-291ec7",
  "org.scalablytyped" %%% "storybook__channels" % "5.3.13-58513c",
  "org.scalablytyped" %%% "storybook__client-api" % "5.3.13-013a29",
  "org.scalablytyped" %%% "storybook__theming" % "5.3.13-1b32b2",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20200121Z-de6228",
  "org.scalablytyped" %%% "typescript" % "3.7.5-a12244")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
