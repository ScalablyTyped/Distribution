organization := "org.scalablytyped"
name := "randoma"
version := "1.3.0-8ccda6"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "color" % "3.0-dt-20200923Z-6069b1",
  "org.scalablytyped" %%% "color-convert" % "1.9-dt-20200515Z-df6aa9",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20200515Z-396355",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
