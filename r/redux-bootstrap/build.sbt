organization := "org.scalablytyped"
name := "redux-bootstrap"
version := "1.3.0-f5cebd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-481742",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190226Z-3ed5cf",
  "org.scalablytyped" %%% "immutable" % "4.0.0-rc.12-7fc30d",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-66c044",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-9e9d73",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-4ff3b1",
  "org.scalablytyped" %%% "react-redux" % "7.0-dt-20190124Z-0d32b7",
  "org.scalablytyped" %%% "react-router" % "4.4-dt-20190212Z-9040f8",
  "org.scalablytyped" %%% "react-router-redux" % "5.0-dt-20190212Z-24071d",
  "org.scalablytyped" %%% "redux" % "4.0.1-c1f77c",
  "org.scalablytyped" %%% "redux-immutable" % "v4.0.0-dt-20190124Z-8d96af",
  "org.scalablytyped" %%% "reselect" % "4.0.0-bc14b5",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-3596cc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        