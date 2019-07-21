organization := "org.scalablytyped"
name := "react-intl-redux"
version := "v0.1.0-dt-20190717Z-80abd1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-c945ed",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-6a02ec",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-c6e514",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190703Z-55594c",
  "org.scalablytyped" %%% "react-intl" % "2.3-dt-20190604Z-ceaf9d",
  "org.scalablytyped" %%% "react-redux" % "7.1-dt-20190627Z-6cc120",
  "org.scalablytyped" %%% "redux" % "4.0.4-d7698e",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        