organization := "org.scalablytyped"
name := "react-router-navigation"
version := "1.0-dt-20181018Z-5957d2"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-939493",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20181018Z-7053ae",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-7481e3",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181212Z-14da82",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20181208Z-ba08ae",
  "org.scalablytyped" %%% "react-navigation" % "2.13-dt-20181130Z-aa7708",
  "org.scalablytyped" %%% "react-router" % "4.4-dt-20181212Z-0a777b",
  "org.scalablytyped" %%% "react-router-navigation-core" % "1.0-dt-20181018Z-17bc89",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        