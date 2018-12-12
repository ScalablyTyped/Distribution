organization := "org.scalablytyped"
name := "react-instantsearch"
version := "5.2-dt-20181208Z-7fd6ee"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-939493",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-7481e3",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181212Z-14da82",
  "org.scalablytyped" %%% "react-instantsearch-core" % "5.2-dt-20181208Z-e916b0",
  "org.scalablytyped" %%% "react-instantsearch-dom" % "5.2-dt-20181206Z-510578",
  "org.scalablytyped" %%% "react-instantsearch-native" % "5.3-dt-20181104Z-1da219",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        