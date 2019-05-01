organization := "org.scalablytyped"
name := "react-intl-redux"
version := "v0.1.0-dt-20190322Z-8e7383"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-908b0a",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-9b4f7e",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-e0e6aa",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190429Z-aae4f0",
  "org.scalablytyped" %%% "react-intl" % "2.3-dt-20190212Z-a5920c",
  "org.scalablytyped" %%% "react-redux" % "7.0-dt-20190419Z-2819d0",
  "org.scalablytyped" %%% "redux" % "4.0.1-1382e4",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        