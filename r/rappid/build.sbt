organization := "org.scalablytyped"
name := "rappid"
version := "1.5-dt-20190213Z-f89820"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "backbone" % "1.3.3-dt-20190322Z-bbe60c",
  "org.scalablytyped" %%% "dagre" % "0.7-dt-20190212Z-10b8dd",
  "org.scalablytyped" %%% "graphlib" % "2.1.1-dt-20190322Z-a472e2",
  "org.scalablytyped" %%% "jointjs" % "2.2.1-1a7f96",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-8061ce",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-601106",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-a5e2be",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20190322Z-46df2e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        