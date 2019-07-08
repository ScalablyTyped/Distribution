organization := "org.scalablytyped"
name := "react-intl-redux"
version := "v0.1.0-dt-20190322Z-9be7a6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-523284",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-024da0",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-c6e514",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190703Z-5fe923",
  "org.scalablytyped" %%% "react-intl" % "2.3-dt-20190604Z-11c53b",
  "org.scalablytyped" %%% "react-redux" % "7.1-dt-20190627Z-8dc9d9",
  "org.scalablytyped" %%% "redux" % "4.0.1-8f7517",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        