organization := "org.scalablytyped"
name := "storybook__addon-storyshots"
version := "5.3.18-a435ff"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__compiler" % "9.1.1-6d4d16",
  "org.scalablytyped" %%% "angular__core" % "9.1.1-169ba6",
  "org.scalablytyped" %%% "csstype" % "2.6.9-2d2033",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.27-5f3caf",
  "org.scalablytyped" %%% "emotion__core" % "10.0.28-6a052a",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.15-c752a7",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.27-426cbc",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.28-ac737f",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.3-263465",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-ed0351",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20200226Z-5d15ca",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20200226Z-b605ef",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20200226Z-6429a4",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20200331Z-8af6d1",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20200226Z-1967d2",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-ece683",
  "org.scalablytyped" %%% "reach__router" % "1.3-dt-20200404Z-c388e5",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200402Z-6f4338",
  "org.scalablytyped" %%% "rxjs" % "6.5.5-f8c277",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.5-708450",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "storybook__addons" % "5.3.18-5e9f6b",
  "org.scalablytyped" %%% "storybook__api" % "5.3.18-14f3c5",
  "org.scalablytyped" %%% "storybook__channels" % "5.3.18-dda6b6",
  "org.scalablytyped" %%% "storybook__client-api" % "5.3.18-9ca3d7",
  "org.scalablytyped" %%% "storybook__router" % "5.3.18-a2312a",
  "org.scalablytyped" %%% "storybook__theming" % "5.3.18-654689",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20200225Z-b4f532",
  "org.scalablytyped" %%% "typescript" % "3.8.3-07d300")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
