organization := "org.scalablytyped"
name := "storybook__addon-notes"
version := "5.3.14-d75e15"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-2d2033",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.27-1c8f85",
  "org.scalablytyped" %%% "emotion__core" % "10.0.28-b1b443",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.15-c752a7",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.27-c45469",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.28-fb0b4b",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.3-263465",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20200131Z-b605ef",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-ece683",
  "org.scalablytyped" %%% "reach__router" % "1.3-dt-20200212Z-d1241d",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200122Z-fc5268",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "storybook__addons" % "5.3.14-8bd9c1",
  "org.scalablytyped" %%% "storybook__api" % "5.3.14-23a41c",
  "org.scalablytyped" %%% "storybook__channels" % "5.3.14-57dc8e",
  "org.scalablytyped" %%% "storybook__router" % "5.3.14-542597",
  "org.scalablytyped" %%% "storybook__theming" % "5.3.14-393ea8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
