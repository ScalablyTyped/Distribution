organization := "org.scalablytyped"
name := "react-redux-epic"
version := "1.1-dt-20181018Z-565e42"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-939493",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181208Z-c640d3",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181203Z-df71a8",
  "org.scalablytyped" %%% "redux" % "4.0.1-7c9b0b",
  "org.scalablytyped" %%% "redux-observable" % "1.0.0-69b5a5",
  "org.scalablytyped" %%% "rxjs" % "6.3.3-f20ccb",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-343133",
  "org.scalablytyped" %%% "tslib" % "1.9.3-13238d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        