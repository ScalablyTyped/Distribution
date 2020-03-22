organization := "org.scalablytyped"
name := "storybook__addon-storyshots"
version := "5.3.14-eb8621"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__compiler" % "9.0.4-18b320",
  "org.scalablytyped" %%% "angular__core" % "9.0.4-465e93",
  "org.scalablytyped" %%% "csstype" % "2.6.9-2d2033",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.27-1c8f85",
  "org.scalablytyped" %%% "emotion__core" % "10.0.28-b1b443",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.15-c752a7",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.27-c45469",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.28-fb0b4b",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.3-263465",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-ed0351",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-b49afb",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20200131Z-b605ef",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-a98e44",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20200130Z-8af6d1",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-1967d2",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-ece683",
  "org.scalablytyped" %%% "reach__router" % "1.3-dt-20200212Z-d1241d",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200122Z-fc5268",
  "org.scalablytyped" %%% "rxjs" % "6.5.4-b9e2d2",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.4-d90dcd",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "storybook__addons" % "5.3.14-8bd9c1",
  "org.scalablytyped" %%% "storybook__api" % "5.3.14-23a41c",
  "org.scalablytyped" %%% "storybook__channels" % "5.3.14-57dc8e",
  "org.scalablytyped" %%% "storybook__client-api" % "5.3.14-8d2c40",
  "org.scalablytyped" %%% "storybook__router" % "5.3.14-542597",
  "org.scalablytyped" %%% "storybook__theming" % "5.3.14-393ea8",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20200121Z-d9d5b7",
  "org.scalablytyped" %%% "typescript" % "3.8.3-4c59b2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
