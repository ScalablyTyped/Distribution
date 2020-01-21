organization := "org.scalablytyped"
name := "pulumi__aws"
version := "1.18.0-1f9bd2"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aws-sdk" % "2.606.0-5d3d07",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-45df85",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "pulumi__pulumi" % "1.8.1-3415c9",
  "org.scalablytyped" %%% "pulumi__query" % "0.3.0-95c3e0",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        