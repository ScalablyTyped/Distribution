organization := "org.scalablytyped"
name := "react-redux-epic"
version := "1.1-dt-20181018Z-fd1bfe"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-bb2c56",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181208Z-000ab2",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181203Z-1b8e7c",
  "org.scalablytyped" %%% "redux" % "4.0.1-5c98ab",
  "org.scalablytyped" %%% "redux-observable" % "1.0.0-f03f2b",
  "org.scalablytyped" %%% "rxjs" % "6.3.3-0ffcd9",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-46014e",
  "org.scalablytyped" %%% "tslib" % "1.9.3-6146fe")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        