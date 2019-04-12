organization := "org.scalablytyped"
name := "rollup-plugin-node-resolve"
version := "4.0-dt-20190121Z-2f9c5f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "acorn" % "4.0-dt-20190212Z-892003",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-0ec5cf",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-512fe2",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20190322Z-a545e5",
  "org.scalablytyped" %%% "rollup" % "1.10.0-2566e0",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        