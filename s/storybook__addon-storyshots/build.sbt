organization := "org.scalablytyped"
name := "storybook__addon-storyshots"
version := "5.3.19-80f0f3"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__compiler" % "9.1.11-453a50",
  "org.scalablytyped" %%% "angular__core" % "9.1.11-deee9a",
  "org.scalablytyped" %%% "csstype" % "2.6.9-7dae47",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.27-934451",
  "org.scalablytyped" %%% "emotion__core" % "10.0.28-a2accd",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.15-250146",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.27-7dfe58",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.28-8cb514",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.3-06730c",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.4-81dd80",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20200604Z-e0f252",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20200518Z-fd6f7b",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20200226Z-17b669",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20200624Z-697568",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20200515Z-d64372",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-034048",
  "org.scalablytyped" %%% "reach__router" % "1.3-dt-20200426Z-707253",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200624Z-23874e",
  "org.scalablytyped" %%% "rxjs" % "6.5.5-51c44e",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.5-9cdce8",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "storybook__addons" % "5.3.19-8e2611",
  "org.scalablytyped" %%% "storybook__api" % "5.3.19-2f960b",
  "org.scalablytyped" %%% "storybook__channels" % "5.3.19-f0ff6b",
  "org.scalablytyped" %%% "storybook__client-api" % "5.3.19-082d3d",
  "org.scalablytyped" %%% "storybook__router" % "5.3.19-77aa6f",
  "org.scalablytyped" %%% "storybook__theming" % "5.3.19-246eca",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20200515Z-5818d2",
  "org.scalablytyped" %%% "typescript" % "3.9.5-0b3ab7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
