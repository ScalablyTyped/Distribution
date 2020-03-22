organization := "org.scalablytyped"
name := "storybook__addon-info"
version := "5.2-dt-20191122Z-8b8f9d"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-2d2033",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.27-d0a960",
  "org.scalablytyped" %%% "emotion__core" % "10.0.28-e659bb",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.15-c752a7",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.27-461f8a",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.28-23b35e",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.3-263465",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20200226Z-b605ef",
  "org.scalablytyped" %%% "node" % "13.9-dt-20200318Z-96a265",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-ece683",
  "org.scalablytyped" %%% "reach__router" % "1.3-dt-20200320Z-481a2b",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200320Z-629467",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "storybook__addons" % "5.3.17-859b87",
  "org.scalablytyped" %%% "storybook__api" % "5.3.17-b0a6d9",
  "org.scalablytyped" %%% "storybook__channels" % "5.3.17-e334e4",
  "org.scalablytyped" %%% "storybook__router" % "5.3.17-08e465",
  "org.scalablytyped" %%% "storybook__theming" % "5.3.17-3edce6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
