organization := "org.scalablytyped"
name := "storybook__addon-storyshots-puppeteer"
version := "5.1-dt-20190802Z-3a7a19"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-550e52",
  "org.scalablytyped" %%% "jest-image-snapshot" % "2.8-dt-20190214Z-d020c9",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191008Z-c62b25",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-08cc8a",
  "org.scalablytyped" %%% "puppeteer" % "1.20-dt-20191010Z-14f5ce",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191014Z-d5b0ca",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "storybook__addon-storyshots" % "5.1-dt-20190813Z-414c54",
  "org.scalablytyped" %%% "storybook__react" % "4.0-dt-20190605Z-4d05a2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        