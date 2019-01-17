organization := "org.scalablytyped"
name := "rmc-calendar"
version := "1.1.4-192465"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-6d1ba2",
  "org.scalablytyped" %%% "csstype" % "2.5.8-61e37d",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-692895",
  "org.scalablytyped" %%% "react" % "16.7-dt-20190116Z-334a51",
  "org.scalablytyped" %%% "rmc-date-picker" % "6.0.8-f527f9",
  "org.scalablytyped" %%% "rmc-dialog" % "1.1.1-e78dfc",
  "org.scalablytyped" %%% "rmc-feedback" % "2.0.0-30ee14",
  "org.scalablytyped" %%% "rmc-picker" % "5.0.5-6a85c6",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        