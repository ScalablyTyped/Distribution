organization := "org.scalablytyped"
name := "storybook__ui"
version := "5.3.18-1af036"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-03f85a",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.27-623528",
  "org.scalablytyped" %%% "emotion__core" % "10.0.28-56488c",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.15-afc453",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.27-f86e9d",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.28-57bf2c",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.3-74adc5",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20200518Z-48aa64",
  "org.scalablytyped" %%% "popper_dot_js" % "1.16.1-e00b14",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-4fb81d",
  "org.scalablytyped" %%% "reach__router" % "1.3-dt-20200426Z-89c27a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200515Z-0f8114",
  "org.scalablytyped" %%% "react-syntax-highlighter" % "11.0-dt-20200515Z-027068",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "storybook__addon-actions" % "5.3.18-3b0d60",
  "org.scalablytyped" %%% "storybook__api" % "5.3.18-94ee81",
  "org.scalablytyped" %%% "storybook__channels" % "5.3.18-a4f6b2",
  "org.scalablytyped" %%% "storybook__components" % "5.3.18-047c00",
  "org.scalablytyped" %%% "storybook__router" % "5.3.18-74050d",
  "org.scalablytyped" %%% "storybook__theming" % "5.3.18-c82b45")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
