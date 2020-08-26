organization := "org.scalablytyped"
name := "storybook__addons"
version := "5.3.19-eafc23"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "3.0.2-b6fa26",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.27-bf2ead",
  "org.scalablytyped" %%% "emotion__core" % "10.0.28-97ae26",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.16-103cdd",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.27-f2e823",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.31-5071ed",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.3-dada02",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20200518Z-4d6e63",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-64dc32",
  "org.scalablytyped" %%% "reach__router" % "1.3-dt-20200426Z-36e2b6",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200711Z-7368c8",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "storybook__api" % "5.3.19-630cc6",
  "org.scalablytyped" %%% "storybook__channels" % "5.3.19-461e38",
  "org.scalablytyped" %%% "storybook__router" % "5.3.19-55af58",
  "org.scalablytyped" %%% "storybook__theming" % "5.3.19-5c3f2b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
