organization := "org.scalablytyped"
name := "pulumi__aws"
version := "0.18.1-6ffd77"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "aws-sdk" % "2.440.0-a9fd92",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190417Z-002402",
  "org.scalablytyped" %%% "pulumi__pulumi" % "0.17.7-d11ebd",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        