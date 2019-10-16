organization := "org.scalablytyped"
name := "storybook__ui"
version := "5.2.4-4f3c96"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-550e52",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.19-e4fa07",
  "org.scalablytyped" %%% "emotion__core" % "10.0.20-8b715a",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.11-aecc7f",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.17-1d21bf",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.19-c8e419",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.2-204041",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190822Z-2fbebe",
  "org.scalablytyped" %%% "popper_dot_js" % "1.15.0-99a62e",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-08cc8a",
  "org.scalablytyped" %%% "reach__router" % "1.2-dt-20191009Z-a7aed4",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191015Z-baf60f",
  "org.scalablytyped" %%% "react-textarea-autosize" % "4.3.0-dt-20190404Z-107840",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "storybook__addon-actions" % "5.2.4-cf3ec8",
  "org.scalablytyped" %%% "storybook__api" % "5.2.4-de1eab",
  "org.scalablytyped" %%% "storybook__channels" % "5.2.4-24df06",
  "org.scalablytyped" %%% "storybook__components" % "5.2.4-e2393e",
  "org.scalablytyped" %%% "storybook__router" % "5.2.4-62718b",
  "org.scalablytyped" %%% "storybook__theming" % "5.2.4-649948")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        