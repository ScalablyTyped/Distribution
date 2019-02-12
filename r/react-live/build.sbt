organization := "org.scalablytyped"
name := "react-live"
version := "1.12.0-a67ef9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "buble" % "0.19-dt-20190127Z-f2eef3",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-56a305",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-7861df",
  "org.scalablytyped" %%% "csstype" % "2.6.2-522be0",
  "org.scalablytyped" %%% "magic-string" % "0.25.2-88f1b8",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190211Z-6a64f2",
  "org.scalablytyped" %%% "prismjs" % "1.9-dt-20180214Z-b31fed",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-8cdf18",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190206Z-d66e8f",
  "org.scalablytyped" %%% "sourcemap-codec" % "1.4.4-873ac9",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        