organization := "org.scalablytyped"
name := "sc-broker"
version := "5.1-dt-20181205Z-964d3e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181205Z-e7c9e5",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-bd0b69",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181104Z-2d0f19",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-df5d12",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181205Z-196786",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20181205Z-3d2f18",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        