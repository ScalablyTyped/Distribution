organization := "org.scalablytyped"
name := "react-chartjs-2"
version := "2.11.1-62703c"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chart_dot_js" % "2.9-dt-20201116Z-f4da70",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b8d190",
  "org.scalablytyped" %%% "moment" % "2.29.1-445fa8",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-a12f9a",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-c80121",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
