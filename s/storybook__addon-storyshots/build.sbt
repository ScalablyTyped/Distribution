organization := "org.scalablytyped"
name := "storybook__addon-storyshots"
version := "5.3.18-a82d67"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__compiler" % "9.1.2-cf144c",
  "org.scalablytyped" %%% "angular__core" % "9.1.2-795c54",
  "org.scalablytyped" %%% "csstype" % "2.6.9-313239",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.27-83a83e",
  "org.scalablytyped" %%% "emotion__core" % "10.0.28-6d5418",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.15-833015",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.27-2b433a",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.28-b51a02",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.3-927e6c",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-da1e84",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20200226Z-74ac81",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20200226Z-849324",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20200226Z-8b5ea8",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20200417Z-b4ce9c",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20200226Z-23b1d1",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-11830c",
  "org.scalablytyped" %%% "reach__router" % "1.3-dt-20200404Z-651a5d",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200409Z-0bc722",
  "org.scalablytyped" %%% "rxjs" % "6.5.5-62f03a",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.5-7f568a",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "storybook__addons" % "5.3.18-8f44a6",
  "org.scalablytyped" %%% "storybook__api" % "5.3.18-dd680c",
  "org.scalablytyped" %%% "storybook__channels" % "5.3.18-2119c6",
  "org.scalablytyped" %%% "storybook__client-api" % "5.3.18-09eff3",
  "org.scalablytyped" %%% "storybook__router" % "5.3.18-ab1cac",
  "org.scalablytyped" %%% "storybook__theming" % "5.3.18-00aeea",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20200225Z-9f3b8d",
  "org.scalablytyped" %%% "typescript" % "3.8.3-9c93d4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
