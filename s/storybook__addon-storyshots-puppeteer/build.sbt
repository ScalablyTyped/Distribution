organization := "org.scalablytyped"
name := "storybook__addon-storyshots-puppeteer"
version := "5.1-dt-20190802Z-7bbac4"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f980df",
  "org.scalablytyped" %%% "jest-image-snapshot" % "2.8-dt-20190214Z-00d155",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190911Z-da4655",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190903Z-bd378a",
  "org.scalablytyped" %%% "puppeteer" % "1.19-dt-20190812Z-4f9d4d",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-53b9fb",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "storybook__addon-storyshots" % "5.1-dt-20190813Z-2b21ec",
  "org.scalablytyped" %%% "storybook__react" % "4.0-dt-20190605Z-ab172d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        