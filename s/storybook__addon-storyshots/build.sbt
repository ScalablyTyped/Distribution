organization := "org.scalablytyped"
name := "storybook__addon-storyshots"
version := "5.3.17-470a8f"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__compiler" % "9.0.7-e4b8ad",
  "org.scalablytyped" %%% "angular__core" % "9.0.7-3875a4",
  "org.scalablytyped" %%% "csstype" % "2.6.9-2d2033",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.27-d0a960",
  "org.scalablytyped" %%% "emotion__core" % "10.0.28-e659bb",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.15-c752a7",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.27-461f8a",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.28-23b35e",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.3-263465",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-ed0351",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20200226Z-20b3d7",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20200226Z-b605ef",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20200226Z-00a5a8",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20200302Z-8af6d1",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20200226Z-1967d2",
  "org.scalablytyped" %%% "node" % "13.9-dt-20200318Z-96a265",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-ece683",
  "org.scalablytyped" %%% "reach__router" % "1.3-dt-20200320Z-481a2b",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200320Z-629467",
  "org.scalablytyped" %%% "rxjs" % "6.5.4-b9e2d2",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.4-d90dcd",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "storybook__addons" % "5.3.17-859b87",
  "org.scalablytyped" %%% "storybook__api" % "5.3.17-b0a6d9",
  "org.scalablytyped" %%% "storybook__channels" % "5.3.17-e334e4",
  "org.scalablytyped" %%% "storybook__client-api" % "5.3.17-266ae0",
  "org.scalablytyped" %%% "storybook__router" % "5.3.17-08e465",
  "org.scalablytyped" %%% "storybook__theming" % "5.3.17-3edce6",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20200225Z-02ea5e",
  "org.scalablytyped" %%% "typescript" % "3.8.3-4c59b2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
