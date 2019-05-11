organization := "org.scalablytyped"
name := "react-intl-redux"
version := "v0.1.0-dt-20190322Z-2ecf51"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-225f24",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-ef05e7",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-66be5f",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190508Z-a9badf",
  "org.scalablytyped" %%% "react-intl" % "2.3-dt-20190212Z-982508",
  "org.scalablytyped" %%% "react-redux" % "7.0-dt-20190419Z-4b18ca",
  "org.scalablytyped" %%% "redux" % "4.0.1-76f17e",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        