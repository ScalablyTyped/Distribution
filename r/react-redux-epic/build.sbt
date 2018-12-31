organization := "org.scalablytyped"
name := "react-redux-epic"
version := "1.1-dt-20181017Z-96c16f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-a13970",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-89199d",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-3dff88",
  "org.scalablytyped" %%% "redux" % "4.0.1-7cb6f2",
  "org.scalablytyped" %%% "redux-observable" % "1.0.0-eabeea",
  "org.scalablytyped" %%% "rxjs" % "6.3.3-04e169",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-dc48cb",
  "org.scalablytyped" %%% "tslib" % "1.9.3-5f911d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        