organization := "org.scalablytyped"
name := "redux-saga-routines"
version := "3.1-dt-20190417Z-d50058"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-3bfbc5",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-4b3bf2",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190613Z-62c565",
  "org.scalablytyped" %%% "redux" % "4.0.1-2e6d53",
  "org.scalablytyped" %%% "redux-actions" % "2.6-dt-20190508Z-45c45f",
  "org.scalablytyped" %%% "redux-form" % "8.1-dt-20190616Z-edc094",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        