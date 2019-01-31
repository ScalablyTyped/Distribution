organization := "org.scalablytyped"
name := "react-live"
version := "1.12.0-6885db"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "buble" % "0.19-dt-20190127Z-5698a8",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-f27478",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-b43647",
  "org.scalablytyped" %%% "csstype" % "2.5.8-ae54dc",
  "org.scalablytyped" %%% "magic-string" % "0.25.1-20e4fc",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-92720c",
  "org.scalablytyped" %%% "prismjs" % "1.9-dt-20180214Z-0a5e18",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-d610b9",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190131Z-997ec6",
  "org.scalablytyped" %%% "sourcemap-codec" % "1.4.4-a1fda7",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        