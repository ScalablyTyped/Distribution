organization := "org.scalablytyped"
name := "react-lifecycle-component"
version := "2.0-dt-20181122Z-99f294"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-225f24",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-efdb34",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-ff94fb",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190508Z-56dde3",
  "org.scalablytyped" %%% "react-redux" % "7.0-dt-20190513Z-559e97",
  "org.scalablytyped" %%% "redux" % "4.0.1-76f17e",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        